package xyz.aguirre.marlon.calc.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.aguirre.marlon.calc.R;

public class TipDetailActivity extends AppCompatActivity {

    @BindView(R.id.txtBillTotal)
    TextView txtBillTotal;
    @BindView(R.id.txtTip)
    TextView txtTip;
    @BindView(R.id.txtTimeStamp)
    TextView txtTimeStamp;

    public final static String TIP_KEY = "tip";
    public final static String DATE_KEY = "timestamp";
    public final static String BILL_TOTAL_KEY ="total";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();

        String strTotal = String.format(getString(R.string.tipDetail_message_total)
                ,intent.getDoubleExtra(BILL_TOTAL_KEY,0d));

        String strTip = String.format(getString(R.string.global_message)
                ,intent.getDoubleExtra(TIP_KEY,0d));

        txtTimeStamp.setText(intent.getStringExtra(DATE_KEY));
        txtBillTotal.setText(strTotal);
        txtTip.setText(strTip);
    }
}
