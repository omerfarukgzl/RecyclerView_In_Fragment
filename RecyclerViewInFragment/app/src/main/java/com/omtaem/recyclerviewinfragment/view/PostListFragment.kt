package com.omtaem.recyclerviewinfragment.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.omtaem.recyclerviewinfragment.R
import com.omtaem.recyclerviewinfragment.adapter.PostRecyclerAdapter
import com.omtaem.recyclerviewinfragment.databinding.FragmentPostListBinding
import com.omtaem.recyclerviewinfragment.model.Post
import com.omtaem.recyclerviewinfragment.viewmodel.PostListViewModel


class PostListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: PostRecyclerAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewModel :PostListViewModel

    private lateinit var binding: FragmentPostListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_post_list, container, false)

        viewModel = ViewModelProvider(this).get(PostListViewModel::class.java)
        viewModel.refreshData()

        val besinListesi: ArrayList<Post> = ArrayList(viewModel.posts.getValue())

        viewManager = LinearLayoutManager(activity)
        viewAdapter = PostRecyclerAdapter(besinListesi)

        recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter
        }
        return view
    }


    fun <T> MutableList<T>.toArrayList(): ArrayList<T> {
        val arrayList = ArrayList<T>(this.size)
        arrayList.addAll(this)
        return arrayList
    }

}