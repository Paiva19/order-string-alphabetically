package com.example.alphabetically.alphabetize

import android.widget.TextView
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.alphabetically.R
import junit.framework.TestCase
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import java.util.*


class AlphabetizeViewModelTest : TestCase() {

    @Rule @JvmField
    val rule: TestRule = InstantTaskExecutorRule()

    @Test
    fun testOnClickAlphabetize() {

        // Create an active task
        val viewModel = AlphabetizeViewModel()
        val unorderedText = "Lucas"

        // Call your function
        val result = viewModel.alphabetize(unorderedText)

        // Check the result
        assertThat(result, `is`("Lacsu"))
    }
}