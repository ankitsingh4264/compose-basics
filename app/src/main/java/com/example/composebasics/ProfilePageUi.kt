package com.example.composebasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ProfileScreen() {
	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		modifier = Modifier
			.fillMaxWidth()
			.fillMaxHeight(),
	) {
		Image(
			painter = painterResource(id = R.drawable.ankitimg),
			contentDescription = "my profile image",
			modifier = Modifier
				.size(200.dp)
				.clip(CircleShape)
				.border(2.dp, Color.Red, CircleShape),
			contentScale = ContentScale.Crop
		)
		Text(text = "Ankit Singh")
		Text(text = "SDE-Android")
		Row(horizontalArrangement = Arrangement.SpaceEvenly,modifier = Modifier.fillMaxWidth().padding(0.dp,10.dp)) {
            ShowStatsData(title =  "150", subtext = "Followers")
			ShowStatsData(title =  "150", subtext = "Following")
			ShowStatsData(title =  "30", subtext = "Posts")
		}

	}

}

@Composable
fun ShowStatsData(title:String,subtext:String){
	Column {
		Text(text = title,fontWeight = FontWeight.Bold)
		Text(text = subtext)
	}
}


@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
	ProfileScreen()
}