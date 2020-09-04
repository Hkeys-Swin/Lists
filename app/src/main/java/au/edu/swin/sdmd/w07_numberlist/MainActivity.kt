package au.edu.swin.sdmd.w07_numberlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BookList = findViewById<RecyclerView>(R.id.BookList)


        val data = arrayOf(Book("Harry Potter", 6, R.drawable.ic_launcher), Book("Game of Thrones", 8, R.drawable.ic_launcher),
                                        Book("Lord of the Rings", 7, R.drawable.ic_launcher), Book("IT", 7, R.drawable.ic_launcher), Book("Lord of the Flies", 5, R.drawable.ic_launcher),
                                        Book("Trees", 3, R.drawable.ic_launcher), Book("Dictionary", 10, R.drawable.ic_launcher), Book("Narnia", 6, R.drawable.ic_launcher),
                                        Book("Bible", 5, R.drawable.ic_launcher), Book("A Book", 10, R.drawable.ic_launcher))

        val Book = BookAdapter(data)
        BookList.adapter = Book
        BookList.layoutManager = LinearLayoutManager(this)

    }
}