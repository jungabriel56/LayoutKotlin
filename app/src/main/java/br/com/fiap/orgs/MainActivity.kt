package br.com.fiap.orgs

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.orgs.model.Produto
import br.com.fiap.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import br.com.fiap.orgs.ui.theme.OrgsTheme
import java.math.BigDecimal

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            produtos = listOf(
                Produto("Teste 0", "Teste Descrição 0", BigDecimal("19.90")),
                Produto("Teste 1", "Teste Descrição 1", BigDecimal("29.90")),
                Produto("Teste 2", "Teste Descrição 2", BigDecimal("39.90")),
            )
        )




    }
}

