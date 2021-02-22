package kz.shoppinglistsimulator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    private var checkBox1: CheckBox? = null
    private var checkBox2: CheckBox? = null
    private var checkBox3: CheckBox? = null
    private var checkBox4: CheckBox? = null
    private var checkBox5: CheckBox? = null
    private var checkBox6: CheckBox? = null
    private var checkBox7: CheckBox? = null
    private var checkBox8: CheckBox? = null
    private var checkBox9: CheckBox? = null
    private var checkBox10: CheckBox? = null
    private var checkBox11: CheckBox? = null
    private var checkBox12: CheckBox? = null
    private var checkBox13: CheckBox? = null
    private var checkBox14: CheckBox? = null
    private var checkBox15: CheckBox? = null
    private var buttonCheck: Button? = null

    private val items: Array<String> = arrayOf("A", "B", "C", "D",
        "E", "F", "G", "H", "I", "J", "K", "L",
        "M", "N", "O", "P", "Q", "R", "S",
        "T", "U", "V", "W", "X", "Y", "Z", "a",
        "b", "c", "d")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        fillCheckBoxes()
        initializeLiseners()
    }

    private fun initializeViews(){
        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)
        checkBox3 = findViewById(R.id.checkBox3)
        checkBox4 = findViewById(R.id.checkBox4)
        checkBox5 = findViewById(R.id.checkBox5)
        checkBox6 = findViewById(R.id.checkBox6)
        checkBox7 = findViewById(R.id.checkBox7)
        checkBox8 = findViewById(R.id.checkBox8)
        checkBox9 = findViewById(R.id.checkBox9)
        checkBox10 = findViewById(R.id.checkBox10)
        checkBox11 = findViewById(R.id.checkBox11)
        checkBox12 = findViewById(R.id.checkBox12)
        checkBox13 = findViewById(R.id.checkBox13)
        checkBox14 = findViewById(R.id.checkBox14)
        checkBox15 = findViewById(R.id.checkBox15)
        buttonCheck = findViewById(R.id.buttonCheck)
    }

    private fun initializeLiseners(){
        buttonCheck?.setOnClickListener {
            if (checkBox1?.isChecked() == false) { checkBox1?.setTextColor(Color.RED) }
            else { checkBox1?.setTextColor(Color.BLACK) }

            if (checkBox2?.isChecked() == false) { checkBox2?.setTextColor(Color.RED) }
            else { checkBox2?.setTextColor(Color.BLACK) }

            if (checkBox3?.isChecked() == false) { checkBox3?.setTextColor(Color.RED) }
            else { checkBox3?.setTextColor(Color.BLACK) }

            if (checkBox4?.isChecked() == false) { checkBox4?.setTextColor(Color.RED) }
            else { checkBox4?.setTextColor(Color.BLACK) }

            if (checkBox5?.isChecked() == false) { checkBox5?.setTextColor(Color.RED) }
            else { checkBox5?.setTextColor(Color.BLACK) }

            if (checkBox6?.isChecked() == false) { checkBox6?.setTextColor(Color.RED) }
            else { checkBox6?.setTextColor(Color.BLACK) }

            if (checkBox7?.isChecked() == false) { checkBox7?.setTextColor(Color.RED) }
            else { checkBox7?.setTextColor(Color.BLACK) }

            if (checkBox8?.isChecked() == false) { checkBox8?.setTextColor(Color.RED) }
            else { checkBox8?.setTextColor(Color.BLACK) }

            if (checkBox9?.isChecked() == false) { checkBox9?.setTextColor(Color.RED) }
            else { checkBox9?.setTextColor(Color.BLACK) }

            if (checkBox10?.isChecked() == false) { checkBox10?.setTextColor(Color.RED) }
            else { checkBox10?.setTextColor(Color.BLACK) }

            if (checkBox11?.isChecked() == false) { checkBox11?.setTextColor(Color.RED) }
            else { checkBox11?.setTextColor(Color.BLACK) }

            if (checkBox12?.isChecked() == false) { checkBox12?.setTextColor(Color.RED) }
            else { checkBox12?.setTextColor(Color.BLACK) }

            if (checkBox13?.isChecked() == false) { checkBox13?.setTextColor(Color.RED) }
            else { checkBox13?.setTextColor(Color.BLACK) }

            if (checkBox14?.isChecked() == false) { checkBox14?.setTextColor(Color.RED) }
            else { checkBox14?.setTextColor(Color.BLACK) }

            if (checkBox15?.isChecked() == false) { checkBox15?.setTextColor(Color.RED) }
            else { checkBox15?.setTextColor(Color.BLACK) }
        }
    }

    private fun randomiseItems(): IntArray{
        val numbers = IntArray(15)

        for (i in 0..14) {
            var number = (0..29).random()
            numbers[i] = number

            // Хотела сделать проверку и возвращать на шаг назад, если совпадают значения, но Val cannot be reassigned. Что делать?
            //for (j in 0 until i) {
            //    if (numbers[j] != number) {
            //        numbers[i] = number
            //    }
            //    else {
            //        i--
            //    }
            //}
        }

        return numbers
    }

    private fun fillCheckBoxes() {
        var numbers = randomiseItems()
        checkBox1?.text = items[numbers[0]]
        checkBox2?.text = items[numbers[1]]
        checkBox3?.text = items[numbers[2]]
        checkBox4?.text = items[numbers[3]]
        checkBox5?.text = items[numbers[4]]
        checkBox6?.text = items[numbers[5]]
        checkBox7?.text = items[numbers[6]]
        checkBox8?.text = items[numbers[7]]
        checkBox9?.text = items[numbers[8]]
        checkBox10?.text = items[numbers[9]]
        checkBox11?.text = items[numbers[10]]
        checkBox12?.text = items[numbers[11]]
        checkBox13?.text = items[numbers[12]]
        checkBox14?.text = items[numbers[13]]
        checkBox15?.text = items[numbers[14]]
    }
}