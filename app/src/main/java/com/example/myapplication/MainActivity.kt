package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
   var num1=0
    var num2=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view=binding.root
        setContentView(view)
        binding.button1.setOnClickListener{

        }
        binding.button2.setOnClickListener{

        }


       var edtNum1:EditText=findViewById(R.id.Edittext)
        var edtNum2:EditText=findViewById(R.id.edtxt)
       var Txt:TextView=findViewById(R.id.TextView)

        binding.button1.setOnClickListener{
            num1=edtNum1.text.toString().toInt()
            num2=edtNum2.text.toString().toInt()
            ADD(binding.Edittext.text.toString().toInt(),
            binding.Edittext.text.toString().toInt())

        }
       binding.button2.setOnClickListener{
            num1=edtNum1.text.toString().toInt()
            num2=edtNum2.text.toString().toInt()
            Substract(binding.Edittext.text.toString().toInt(),
                binding.Edittext.text.toString().toInt())

        }
       binding.button3.setOnClickListener{
            num1=edtNum1.text.toString().toInt()
            num2=edtNum2.text.toString().toInt()
            Multiply(binding.Edittext.text.toString().toInt(),
                binding.Edittext.text.toString().toInt())
        }
        binding.button4.setOnClickListener{
            num1=edtNum1.text.toString().toInt()
            num2=edtNum2.text.toString().toInt()
            Divide(binding.Edittext.text.toString().toInt(),
                binding.Edittext.text.toString().toInt())

        }





    }
    private fun ADD( num1:Int,num2:Int){
       var result=num1+num2;
       binding.TextView.text=result.toString()
    }

    private fun Substract( num1:Int,num2:Int){
        var result=num1-num2;
        binding.TextView.text=result.toString()
    }

    private fun Multiply( num1:Int,num2:Int){
        var result=num1*num2;
        binding.TextView.text=result.toString()
    }

    private fun Divide( num1:Int,num2:Int){
        var result=num1/num2;
        binding.TextView.text=result.toString()
    }

}