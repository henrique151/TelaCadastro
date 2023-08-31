package com.example.composecomponentscadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecomponentscadastro.ui.theme.ComposeComponentsCadastroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                App()
        }
    }
}

@Composable
fun App() {
    ComposeComponentsCadastroTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TopAppBarSample()
                ImageSample()
                TextFieldName()
                TextFieldWithIcons()
                TextFieldTelefone()
                TextFieldCPF()
                TextFieldRG()
                TextFieldEndereco()
                TextFieldData()
                PasswordTextField()
                ButtonWithIconSample()
            }
        }

    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 1000)
@Composable
fun AppPreview() {
    App()
}


@Preview(showBackground = true, widthDp = 300, heightDp = 200)
@Composable
fun ImagePreviw() {
    ImageSample()
}

@Preview(showBackground = true, widthDp = 300, heightDp = 200)
@Composable
fun ButtonPreviw() {
    ButtonWithIconSample()
}

@Preview(showBackground = true, widthDp = 300, heightDp = 200)
@Composable
fun TextFieldNamePreviw() {
    TextFieldName()
}

@Preview(showBackground = true, widthDp = 300, heightDp = 200)
@Composable
fun TextFieldWithIconsPreviw() {
    TextFieldWithIcons()
}

@Preview(showBackground = true, widthDp = 300, heightDp = 200)
@Composable
fun  TextFieldTelefonePreviw() {
    TextFieldTelefone()
}

@Preview(showBackground = true, widthDp = 300, heightDp = 200)
@Composable
fun TextFieldCPFPreviw() {
    TextFieldCPF()
}


@Preview(showBackground = true, widthDp = 300, heightDp = 200)
@Composable
fun TopAppBarSamplePreview() {
    TopAppBarSample()
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarSample(){
    Column {
        TopAppBar(
            title = {
                Text("Tela de Cadastro")
            },
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.Menu, null)
                }
            }, actions = {
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.AccountBox, null)
                }
            })
    }
}

@Composable
fun ButtonWithIconSample() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { /* Do something! */ },
            contentPadding = ButtonDefaults.ButtonWithIconContentPadding
        ) {
            Icon(
                Icons.Filled.Check,
                contentDescription = "Localized description",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Login")
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldWithIcons() {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text("Email") },
            leadingIcon = { Icon(Icons.Filled.Email, contentDescription = "Localized description") },
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldName() {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text("Nome") },
            leadingIcon = { Icon(Icons.Filled.AccountCircle, contentDescription = "Localized description") },
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldCPF() {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text("CPF") },
            leadingIcon = { Icon(Icons.Filled.AccountBox, contentDescription = "Localized description") },
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldRG() {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text("RG") },
            leadingIcon = { Icon(Icons.Filled.AccountBox, contentDescription = "Localized description") },
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldEndereco() {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text("Endereço") },
            leadingIcon = { Icon(Icons.Filled.Home, contentDescription = "Localized description") },
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldData() {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text("Data de nascimento") },
            leadingIcon = { Icon(Icons.Filled.DateRange, contentDescription = "Localized description") },
        )
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldTelefone() {
    var text by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text("Telefone") },
            leadingIcon = { Icon(Icons.Filled.Phone, contentDescription = "Localized description") },
        )
    }

}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField() {
    var password by rememberSaveable { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(10.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = password,
            onValueChange = { password = it },
            singleLine = true,
            label = { Text("Senha") },
            leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Localized description") },
        )
    }
}


@Composable
fun ImageSample() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val imageModifier = Modifier
            .height(200.dp)
            .width(200.dp)
            .padding(10.dp)
        Image(
            painter = painterResource(id = R.drawable.tela),
            contentDescription = "",
            contentScale = ContentScale.Fit,
            modifier = imageModifier,
        )
    }
}

