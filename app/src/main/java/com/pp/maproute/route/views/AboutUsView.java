package com.pp.maproute.route.views;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.pp.maproute.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Safa Amin on 24/03/2019.
 */
public class AboutUsView extends DialogFragment {

    private static String ABOUT_US_CONTENT_PARAM = "ABOUT_US_CONTENT";
    @BindView(R.id.tv_about_us_content)
    TextView tvAboutUsContent;
    private String content;
    private Spanned aboutUsContent;

    public static AboutUsView getInstance(String content) {
        AboutUsView fragment = new AboutUsView();

        Bundle args = new Bundle();
        args.putString(ABOUT_US_CONTENT_PARAM, content);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            int width = ViewGroup.LayoutParams.MATCH_PARENT;
            int height = ViewGroup.LayoutParams.MATCH_PARENT;
            dialog.getWindow().setLayout(width, height);
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            content = getArguments().getString(ABOUT_US_CONTENT_PARAM);
            aboutUsContent = Html.fromHtml(Html.fromHtml(content).toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_about_us, container, false);

        ButterKnife.bind(this, v);

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
        }
        tvAboutUsContent.setMovementMethod(new ScrollingMovementMethod());
        tvAboutUsContent.setText(aboutUsContent);

    }

    @OnClick(R.id.iv_about_us_close)
    public void onClickAboutUsClose() {
        dismiss();
    }
}
