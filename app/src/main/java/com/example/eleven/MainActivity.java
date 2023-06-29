package com.example.eleven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.eleven.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.flightModeButton.setOnClickListener(v -> Toast.makeText( this, "Modo avión Desactivado",Toast.LENGTH_LONG).show());
        binding.updatingButton.setOnClickListener(v -> Toast.makeText( this, "Actualizar perfil",Toast.LENGTH_LONG).show());
        binding.pictureButton.setOnClickListener(v -> Toast.makeText( this, "Guardar imagen en galería",Toast.LENGTH_LONG).show());
        binding.levelFiveButton.setOnClickListener(v -> Toast.makeText( this, "Desbloquear nivel 5",Toast.LENGTH_LONG).show());
        binding.levelFourButton.setOnClickListener(v -> Toast.makeText( this, "Nivel 4 completado",Toast.LENGTH_LONG).show());
        binding.musicBotton.setOnClickListener(v -> Toast.makeText( this, "Pausar música",Toast.LENGTH_LONG).show());
    }
}