package jp.co.kiganix.android.example.androiddeeplink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.co.kiganix.android.example.androiddeeplink.databinding.EmptyActivityBinding

class EmptyActivity : AppCompatActivity() {

    private lateinit var binding: EmptyActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = EmptyActivityBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        intent?.let {
            binding.action.text = it.action
            binding.uri.text = it.data.toString()
        }
    }

}
