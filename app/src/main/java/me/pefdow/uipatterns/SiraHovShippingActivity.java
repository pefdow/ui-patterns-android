package me.pefdow.uipatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class SiraHovShippingActivity extends AppCompatActivity {

    TextView txtNewAct;
    TextView txtForgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sirahov_shipping);

        txtNewAct = findViewById(R.id.txtNewAct);
        txtForgotPass = findViewById(R.id.txtForgotPassword);

        String sNewAccount = getString(R.string.create_a_new_account);
        String sForgotPassword = getString(R.string.forgot_password);

        String htmlNewAccount = "<u>&nbsp;" + sNewAccount + "&nbsp;</u>";
        String htmlForgotPassword = "<u>&nbsp;" + sForgotPassword + "&nbsp;</u>";

        txtNewAct.setText(Html.fromHtml(htmlNewAccount));
        txtForgotPass.setText(Html.fromHtml(htmlForgotPassword));
    }
}
