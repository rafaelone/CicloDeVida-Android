package br.com.rafaelsergio.ciclodevida.viewmodelcomlivedata

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.rafaelsergio.ciclodevida.R

class PlacarActivity : AppCompatActivity() {

    var placarViewlModel: PlacarViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        placarViewlModel = ViewModelProviders.of(this).get(PlacarViewModel::class.java)
    }
}
