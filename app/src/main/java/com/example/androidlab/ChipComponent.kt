import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.androidlab.ui.theme.MyTextStyle.ChipStyle
import com.example.androidlab.ui.theme.colorChip

@Composable
fun Chip(text: String) {
    Box(
        modifier = Modifier
            .padding(horizontal = 4.dp)
            .background(
                Color(android.graphics.Color.parseColor(colorChip)),
                shape = RoundedCornerShape(45.dp)
            )
            .padding(8.dp)
    ) {
        Text(
            text = text,
            style = ChipStyle
        )
    }
}