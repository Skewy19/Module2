package com.example.myapplication1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.ui.theme.MyApplication1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication1Theme {
                AllTasks()
            }
        }
    }
}

@Composable
fun AllTasks() {
    Column {
        Task1()
        Task2()
        Task3()
        Task4()
        Task5()
    }
}

// 1

@Composable
fun Task1() {
    Text(text = "задание 1")

    Hello(name = "Skewy")
    Hello(name = null)
}

@Composable
fun Hello(name: String?) {
    if (name == null) {
        Text(text = "Имя не задано")
    } else {
        Text(text = "Привет, $name!")
    }
}

// 2

@Composable
fun Task2() {
    Text(text = "задание 2")
}

@Composable
fun Task2Content() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {

    }
}

@Preview(
    name = "Портрет",
    widthDp = 360,
    heightDp = 800
)
@Composable
fun PortraitPreview() {
    Task2Content()
}

@Preview(
    name = "Альбом",
    widthDp = 800,
    heightDp = 360
)
@Composable
fun LandscapePreview() {
    Task2Content()
}

@Preview(
    name = "Круглый экран",
    widthDp = 200,
    heightDp = 200,
    showBackground = true,
    backgroundColor = 0xFFFFFF00
)
@Composable
fun RoundPreview() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape)
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Круглый экран")
    }
}

// 3

@Composable
fun Task3() {
    Text(text = "задание 3")

    val description = stringResource(
        id = R.string.jetpack_compose_description
    )

    // зеленый курсивный текст по центру
    Text(
        text = description,
        modifier = Modifier.fillMaxWidth(),
        fontSize = 16.sp,
        color = Color.Green,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center
    )

    // одна строка с многоточием
    Text(
        text = description,
        modifier = Modifier.fillMaxWidth(),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )

    // отступ первой строки, зеленый фон и подчеркивание
    Text(
        text = description,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green),
        style = TextStyle(
            fontSize = 24.sp,
            color = Color.Black,
            textIndent = TextIndent(firstLine = 48.sp),
            textDecoration = TextDecoration.Underline
        )
    )
}


// 4
@Composable
fun Task4() {
    Text(text = "задание 4")

    Button(
        onClick = {},
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Gray),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 4.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFFB6C1),
            contentColor = Color.Black
        )
    ) {
        Text(text = "Кнопка")
    }
}


// 5
@Composable
fun Task5() {
    Text(text = "задание 5")

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxHeight()
                .aspectRatio(1f)
                .clip(CircleShape)
                .background(Color(0xFFB0C4DE)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "АБ")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AllTasksPreview() {
    MyApplication1Theme {
        AllTasks()
    }
}