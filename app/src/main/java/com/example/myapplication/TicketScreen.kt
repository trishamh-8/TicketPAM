package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ConfirmationNumber
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.NumberFormat
import java.util.Locale

@Composable
fun TicketScreen() {

    val hargaTiket = 25000
    var jumlahTiket by remember { mutableStateOf(1) }

    val totalBayar = hargaTiket * jumlahTiket
    val rupiah = NumberFormat.getCurrencyInstance(Locale("id", "ID"))

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF3F5F8))
    ) {

        // ================= HEADER =================
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(230.dp)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF006CFF),
                            Color(0xFF2EA8FF)
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Icon(
                    imageVector = Icons.Default.ConfirmationNumber,
                    contentDescription = null,
                    modifier = Modifier.size(58.dp),
                    tint = Color.White
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Pemesanan Tiket",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Pesan tiket dengan mudah!",
                    fontSize = 15.sp,
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }

        // ================= CONTENT =================
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .offset(y = (-18).dp)
        ) {

            // Harga Tiket
            InfoCard(
                title = "Harga Tiket",
                value = rupiah.format(hargaTiket),
                subtitle = "per tiket",
                valueColor = Color(0xFF1877F2)
            )

            Spacer(modifier = Modifier.height(14.dp))

            // Jumlah Tiket
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {

                Column(
                    modifier = Modifier.padding(18.dp)
                ) {

                    Text(
                        text = "Jumlah Tiket",
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        CircleButton(
                            icon = Icons.Default.Remove,
                            color = Color(0xFF1877F2)
                        ) {
                            if (jumlahTiket > 1) jumlahTiket--
                        }

                        Box(
                            modifier = Modifier
                                .width(110.dp)
                                .height(56.dp)
                                .clip(RoundedCornerShape(14.dp))
                                .background(Color(0xFFF0F3F8)),
                            contentAlignment = Alignment.Center
                        ) {

                            Text(
                                text = jumlahTiket.toString(),
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        CircleButton(
                            icon = Icons.Default.Add,
                            color = Color(0xFF1877F2)
                        ) {
                            jumlahTiket++
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Total Bayar
            InfoCard(
                title = "Total",
                value = rupiah.format(totalBayar),
                subtitle = "",
                valueColor = Color(0xFF00853F)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Tombol Reset
            Button(
                onClick = { jumlahTiket = 1 },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF3B3B)
                ),
                shape = RoundedCornerShape(14.dp)
            ) {

                Icon(
                    imageVector = Icons.Default.Refresh,
                    contentDescription = null,
                    tint = Color.White
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = "RESET",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

// ================= INFO CARD =================

@Composable
fun InfoCard(
    title: String,
    value: String,
    subtitle: String,
    valueColor: Color
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {

        Column(
            modifier = Modifier.padding(18.dp)
        ) {

            Text(
                text = title,
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF303030)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = value,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = valueColor
            )

            if (subtitle.isNotEmpty()) {
                Text(
                    text = subtitle,
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            }
        }
    }
}

// ================= TOMBOL BULAT =================

@Composable
fun CircleButton(
    icon: ImageVector,
    color: Color,
    onClick: () -> Unit
) {

    Box(
        modifier = Modifier
            .size(58.dp)
            .clip(CircleShape)
            .background(color),
        contentAlignment = Alignment.Center
    ) {

        IconButton(onClick = onClick) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(28.dp)
            )
        }
    }
}

// ================= PREVIEW =================

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewTicketScreen() {
    TicketScreen()
}