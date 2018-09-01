package br.com.rafaelsergio.ciclodevida.viewmodelcomlivedata

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.rafaelsergio.ciclodevida.R
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    var placarViewlModel: PlacarViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        placarViewlModel = ViewModelProviders.of(this).get(PlacarViewModel::class.java)

        placarViewlModel?.placarVisitante?.observe(this, Observer {
                tvPontoB.text = it?.toString()
        })

        placarViewlModel?.placarCasa?.observe(this, Observer {
            tvPontoA.text = it?.toString()
        })


        btA1.setOnClickListener {
            placarViewlModel?.pontoCasa(1)
        }

        btA2.setOnClickListener {
            placarViewlModel?.pontoCasa(2)
        }

        btA3.setOnClickListener {
            placarViewlModel?.pontoCasa(3)
        }

        btB1.setOnClickListener {
            placarViewlModel?.pontoVisitante(1)
        }


        btB2.setOnClickListener {
            placarViewlModel?.pontoVisitante(2)
        }


        btB3.setOnClickListener {
            placarViewlModel?.pontoVisitante(3)
        }

     btReiniciar.setOnClickListener {
         placarViewlModel?.reiniciar()
     }
    }
}
