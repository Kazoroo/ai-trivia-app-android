package com.triviagenai.triviagen.trivia.presentation.roundsetup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.triviagenai.triviagen.R
import com.triviagenai.triviagen.core.presentation.TriviaGenScaffold
import com.triviagenai.triviagen.ui.theme.RoyalPurple

@Composable
fun RoundSetupScreen() {
    var topicValue by remember { mutableStateOf("") }

    TriviaGenScaffold(backNavigationIcon = true) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .width(dimensionResource(id = R.dimen.element_xlarge))
                    .height(dimensionResource(id = R.dimen.element_height) + 10.dp) // without plus 10.dp the text field has a smaller height than the buttons
                    .padding(bottom = dimensionResource(id = R.dimen.padding_small)),
                value = topicValue,
                onValueChange = { topicValue = it },
                label = { Text("Label") },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White,
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    focusedLabelColor = Color.White
                ),
                singleLine = true
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                shape = AbsoluteRoundedCornerShape(dimensionResource(id = R.dimen.rounded_corner)),
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.padding_small))
                    .width(dimensionResource(id = R.dimen.element_xlarge))
                    .height(dimensionResource(id = R.dimen.element_height))
            ) {
                Text(
                    text = stringResource(R.string.start_round),
                    color = RoyalPurple,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = stringResource(R.string.or),
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.padding_small))
            )

            ElevatedButton(
                onClick = { /*TODO*/ },
                shape = AbsoluteRoundedCornerShape(dimensionResource(id = R.dimen.rounded_corner)),
                modifier = Modifier
                    .padding(dimensionResource(id = R.dimen.padding_small))
                    .width(dimensionResource(id = R.dimen.element_xlarge))
                    .height(dimensionResource(id = R.dimen.element_height))
            ) {
                Text(
                    text = stringResource(R.string.random_round),
                    color = RoyalPurple,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}