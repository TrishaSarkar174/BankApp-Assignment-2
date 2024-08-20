package com.example.bankapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Accounts accounts = new Accounts();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void displayAccounts(View view) {
        Spinner accountTypeSpinner = (Spinner) findViewById(R.id.accountTypeSpinnerID);
        String selectedAccount = String.valueOf(accountTypeSpinner.getSelectedItem());

        List<String> accountList = accounts.getAccounts(selectedAccount);

        StringBuilder formattedAccount = new StringBuilder();

        for(String acc: accountList)
        {
            formattedAccount.append(acc).append('\n');
        }

        TextView textView = (TextView) findViewById(R.id.displayID);
        textView.setText(formattedAccount);
    }
}