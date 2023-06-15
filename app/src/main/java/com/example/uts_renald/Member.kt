package com.example.uts_renald

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Member.newInstance] factory method to
 * create an instance of this fragment.
 */
class Member : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: MemberAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var memberList: List<DataMember>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_member, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Member.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Member().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = GridLayoutManager(context, 2)
        val recyclerView: RecyclerView = view.findViewById(R.id.rv_member)
        recyclerView.setHasFixedSize(true)
        adapter = MemberAdapter(requireContext(), memberList) { member ->
            Toast.makeText(requireContext(), "Item ${member.namemember} diklik", Toast.LENGTH_SHORT).show()
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
    }

    private fun dataInitialize() {

        memberList = listOf<DataMember>(
            DataMember(
                R.drawable.bangchan,
                namemember = "Bangchan - Chris Bang Chan",
            ),
            DataMember(
                R.drawable.lino,
                namemember = "Lee Know - Lee Min Ho",
            ),
            DataMember(
                R.drawable.changbin,
                namemember = "Changbin - Seo Chang Bin",
            ),
            DataMember(
                R.drawable.hyunjin,
                namemember = "Hyunjin - Hwang Hyun Jin",
            ),
            DataMember(
                R.drawable.han,
                namemember = "Han - Han Ji Sung",
            ),
            DataMember(
                R.drawable.felix,
                namemember = "Felix - Lee Yong Bok",
            ),
            DataMember(
                R.drawable.seungmin,
                namemember = "Seungmin - Kim Seung Min",
            ),
            DataMember(
                R.drawable.`in`,
                namemember = "I.N - Yang Jeong In",
            )
        )
    }
}