package br.com.fiap.orgs.ui.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.orgs.R
import br.com.fiap.orgs.model.Produto

class ListaProdutosAdapter(
    private val context: Context,
    private val produtos: List<Produto>
):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun vincula(produto: Produto) {
            val nome = itemView.findViewById<TextView>(R.id.nome)
            nome.text = produto.nome

            val descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = produto.descricao

            val valor = itemView.findViewById<TextView>(R.id.valor)
            valor.text = produto.valor.toPlainString()
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ):RecyclerView.ViewHolder{
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)
        return ListaProdutosAdapter.ViewHolder(view)
    }
    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(
        holder: ListaProdutosAdapter.ViewHolder,
        position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

}