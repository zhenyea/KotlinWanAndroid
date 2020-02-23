package com.wl.wanandroid.activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wl.wanandroid.R
import com.wl.wanandroid.utils.ImmerBarUtils
import com.wl.wanandroid.utils.StringUtils
import kotlinx.android.synthetic.main.activity_public_number.*

class CollectArticleActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collect_article)
        ImmerBarUtils.initImmerBar(this,R.color.alpha_gray_white)

        initToolbar()
    }

    private fun initToolbar() {

        index_toolbar.setNavigationIcon(R.drawable.icon_back_gray)
        index_toolbar.setTitleTextColor(Color.WHITE)
        index_toolbar.setTitle("")
        index_toolbar.setNavigationOnClickListener {
            finish()
        }

        tv_title.text = StringUtils.getString(R.string.string_collect)
    }
}
