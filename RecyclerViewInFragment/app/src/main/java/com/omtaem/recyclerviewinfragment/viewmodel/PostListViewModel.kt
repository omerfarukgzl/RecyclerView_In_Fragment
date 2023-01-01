package com.omtaem.recyclerviewinfragment.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.omtaem.recyclerviewinfragment.model.Post

class PostListViewModel :ViewModel(){

    val posts = MutableLiveData<List<Post>>()
    val postErrorMessage = MutableLiveData<Boolean>()
    val postLoading=MutableLiveData<Boolean>()


    fun refreshData()
    {
        val banana = Post("Banana","Banana is Yellow")
        val strawbarry = Post("Strawbarry","Strawbarry is Red")
        val aplle = Post("Apple","Apple is Green")
        val orange = Post("Orange","Orange is orange")


        // oluşturulan besinleri array listde saklama - sonradan ekelme çıkarma yapılabilir
        val postlist= arrayListOf<Post>(banana,strawbarry,aplle,orange)

        // besinler MutableLiveData değişkenine besinlistesini atama
        posts.value=postlist
        postErrorMessage.value=false
        postLoading.value=false
    }


}