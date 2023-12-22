import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androidlab.ui.theme.MyTextStyle.ButtonStyle

@Composable
fun PrimaryOvalButton(text: String, modifier: Modifier = Modifier) {
    TextButton(
        onClick = { },
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFAC00))
    ) {
        Text(
            text = text,
            style = ButtonStyle
        )
    }
}