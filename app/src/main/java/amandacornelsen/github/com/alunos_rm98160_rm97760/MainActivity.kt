package amandacornelsen.github.com.alunos_rm98160_rm97760

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import amandacornelsen.github.com.alunos_rm98160_rm97760.model.Evento

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: EventoAdapter
    private val listaEventos = mutableListOf<Evento>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nomeLocal: EditText = findViewById(R.id.nomeLocal)
        val eventos: EditText = findViewById(R.id.evento)
        val tipoImpacto: EditText = findViewById(R.id.impacto)
        val dataEvento: EditText = findViewById(R.id.data)
        val pessoasAfetadas: EditText = findViewById(R.id.pessoas)
        val incluir: Button = findViewById(R.id.incluir)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = EventoAdapter(listaEventos)
        recyclerView.adapter = adapter

        incluir.setOnClickListener {
            val nomelocal = nomeLocal.text.toString()
            val impacto = tipoImpacto.text.toString()
            val pessoas = pessoasAfetadas.text.toString().toIntOrNull() ?: 0
            val data = dataEvento.text.toString()
            val eventoClimatico = eventos.text.toString()

            if (nomelocal.isNotBlank() && impacto.isNotBlank() && data.isNotBlank() && eventoClimatico.isNotBlank()) {
                val evento = Evento(nomelocal, impacto, pessoas, data, eventoClimatico)
                listaEventos.add(evento)
                adapter.notifyItemInserted(listaEventos.size - 1)

                nomeLocal.text.clear()
                tipoImpacto.text.clear()
                pessoasAfetadas.text.clear()
                dataEvento.text.clear()
                eventos.text.clear()
            }

            }
        }
    }