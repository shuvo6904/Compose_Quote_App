package com.example.compose_quote_app.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.compose_quote_app.R
import com.example.compose_quote_app.models.Quote

@Composable
fun QuoteListScreen(data: Array<Quote>, modifier: Modifier, onClick: () -> Unit) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.titleLarge,
            fontFamily = FontFamily(Font(R.font.montserrat_regular))
        )
        LazyColumn {
            items(data.size) {
                QuoteListItem(data[it]) {onClick()}
            }
        }
    }
}