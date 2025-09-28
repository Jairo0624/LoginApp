package com.example.loginapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.example.loginapp.R
import com.example.loginapp.ui.theme.RegisterScreenRoute

@Composable
fun LoginScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black) // Fondo oscuro
    ) {
        // Header negro con logo
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = "https://static-cdn.jtvnw.net/jtv_user_pictures/mmoga-profile_image-7f524f433247f0cf-300x300.jpeg",
                placeholder = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(20, 0, 20, 20)),
                contentScale = ContentScale.Crop
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .clip(RoundedCornerShape(topStart = 50.dp, topEnd = 0.dp)) // esquinas arriba
                .background(Color.White)
                .align(Alignment.BottomCenter)
                .padding(30.dp, vertical = 10.dp),

        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp, bottom = 20.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,

                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Email",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )

            var correotxt by remember { mutableStateOf("") }

            OutlinedTextField(
                value = correotxt,
                onValueChange = { correotxt = it },
                label = {
                    Text(
                        text = "Ingrese su Correo",
                        color = Color.DarkGray
                    )
                },
                singleLine = true,
                textStyle = TextStyle(Color.DarkGray, fontSize = 16.sp),
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 20.dp),
                shape = RoundedCornerShape(12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            var contraseñatxt by remember { mutableStateOf("") }


            Text(
                text = "Password",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )

            OutlinedTextField(
                value = contraseñatxt,
                onValueChange = { contraseñatxt = it },
                label = {
                    Text(
                        text = "Ingrese su Contraseña",
                        color = Color.DarkGray
                    )
                },
                singleLine = true,
                textStyle = TextStyle(Color.DarkGray, fontSize = 16.sp),
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 30.dp),
                shape = RoundedCornerShape(12.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { "nada"},
                modifier = Modifier.fillMaxWidth()
                    .height(55.dp),
                shape = RoundedCornerShape(10.dp, 0.dp, 10.dp, 10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White,
                    fontSize = 16.sp,
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            TextButton(
                onClick = { navController.navigate(RegisterScreenRoute) },
                modifier = Modifier.fillMaxWidth()
                    .height(55.dp),
            ) {
                Text(
                    text = "Don't have an account? Sign Up",
                    fontSize = 16.sp,
                    color = Color.Black,
                    textDecoration = TextDecoration.Underline
                )
            }



        }
    }
}


@Preview(showBackground = true)

@Composable
fun LoginScreenPreview(){
    LoginScreen(navController = NavController(LocalContext.current))
}
