package com.syntxr.anohikari.presentation.home.jozz.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.syntxr.anohikari.domain.model.Jozz
import com.syntxr.anohikari.domain.model.Sora
import com.syntxr.anohikari.presentation.home.sora.component.SoraItem
import com.syntxr.anohikari.ui.theme.AnoHikariTheme

@Composable
fun JozzItem(
    jozz: Jozz,
    soras: List<Sora>,
    modifier: Modifier = Modifier,
) {
    Card(
        colors = CardDefaults
            .cardColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer
            )
    ) {
        Column(
            modifier.padding(12.dp)
        ) {
            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Juz ${jozz.jozz}",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Normal

                )
                Text(
                    text = "Read Juz",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Normal,
                    textDecoration = TextDecoration.Underline
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                content = {
                    items(soras){ sora ->
                        SoraItem(sora = sora)
                    }
                }
            )
        }
    }
}

@Preview(showBackground = false)
@Composable
fun ItemJozzPreview() {
    AnoHikariTheme (
        darkTheme = true
    ) {
//        JozzItem()
    }
}