package com.example.loginapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButtonDefaults.elevation
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.example.loginapp.R
import com.example.loginapp.ui.theme.RegisterScreenRoute

@Composable
fun RegisterScreen(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black) // Fondo oscuro
    ) {
        // Header negro con logo
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {

            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.align(Alignment.CenterStart)
                    .padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }

                Text(
                    text = "Sign Up",
                    fontSize = 35.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(680.dp)
                .clip(RoundedCornerShape(topStart = 70.dp, topEnd = 0.dp)) // esquinas arriba
                .background(Color.White)
                .align(Alignment.BottomCenter)
                .padding(40.dp, vertical = 0.dp),


            ) {

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "First Name",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier.padding(start = 15.5.dp)
            )

            var primerNombreTxt by remember { mutableStateOf("") }

            OutlinedTextField(
                value = primerNombreTxt,
                onValueChange = { primerNombreTxt = it },
                label = { Text("Ingrese su Primer Nombre") },
                singleLine = true,
                textStyle = TextStyle(Color.DarkGray, fontSize = 16.sp),
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .height(60.dp),
                    //.shadow(1.dp, shape = RoundedCornerShape(12.dp)),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent),

            )

            Text(
                text = "Last Name",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier.padding(start = 15.5.dp)
            )

            var ApellidoTxt by remember { mutableStateOf("") }

            OutlinedTextField(
                value = ApellidoTxt,
                onValueChange = { ApellidoTxt = it },
                label = { Text("Ingrese sus Apellidos") },
                singleLine = true,
                textStyle = TextStyle(Color.DarkGray, fontSize = 16.sp),
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .height(60.dp),
                //.shadow(1.dp, shape = RoundedCornerShape(12.dp)),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent),

                )

            Text(
                text = "Email",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier.padding(start = 15.5.dp)
            )

            var correotxt by remember { mutableStateOf("") }

            OutlinedTextField(
                value = correotxt,
                onValueChange = { correotxt = it },
                label = { Text("Ingrese un Correo") },
                singleLine = true,
                textStyle = TextStyle(Color.DarkGray, fontSize = 16.sp),
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent)
            )

            var contraseñatxt by remember { mutableStateOf("") }

            Text(
                text = "Password",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier.padding(start = 15.5.dp)
            )

            OutlinedTextField(
                value = contraseñatxt,
                onValueChange = { contraseñatxt = it },
                singleLine = true,
                label = { Text("Ingrese una Constraseña") },
                textStyle = TextStyle(Color.DarkGray, fontSize = 16.sp),
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 10.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent)
            )

            var confContraseñatxt by remember { mutableStateOf("") }

            Text(
                text = "Confirm Password",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 16.sp,
                color = Color.Black,
                modifier = Modifier.padding(start = 15.5.dp)
            )

            OutlinedTextField(
                value = confContraseñatxt,
                onValueChange = { confContraseñatxt= it },
                singleLine = true,
                label = { Text("Confirme su Constraseña") },
                textStyle = TextStyle(Color.DarkGray, fontSize = 16.sp),
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 25.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent)
            )

            Button(
                onClick = { "nada"},
                modifier = Modifier.fillMaxWidth()
                    .height(55.dp),
                shape = RoundedCornerShape(10.dp, 0.dp, 10.dp, 10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(
                    text = "Sign Up",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White,
                    fontSize = 16.sp,
                )
            }

            Spacer(modifier = Modifier.height(15.dp))

            TextButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.fillMaxWidth()
                    .height(50.dp),
            ) {
                Text(
                    text = "Already have any account? Sign In",
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
fun RegisterScreenPreview() {
    RegisterScreen(navController = NavController(LocalContext.current))
}
