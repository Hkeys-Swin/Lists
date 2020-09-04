package au.edu.swin.sdmd.w07_numberlist

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter(private val data: Array<Book>) : RecyclerView.Adapter<BookAdapter.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.layout_row, parent, false) as View
        return BookAdapter.ViewHolder(view)
    }

    override fun getItemCount() = data.size


    override fun onBindViewHolder(holder: BookAdapter.ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    class ViewHolder(private val v: View) : RecyclerView.ViewHolder(v) {
        private val title: TextView = v.findViewById(R.id.Title)
        private val rating: TextView = v.findViewById(R.id.Rating)
        private val image: ImageView = v.findViewById(R.id.Image)

        fun bind(item: Book) {
            title.setText(item.name)
            rating.setText((item.rating.toString()))
            image.setImageResource(item.image)
        }
    }

}