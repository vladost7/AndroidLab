import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androidlab.ui.theme.MyTextStyle.CommentDateStyle
import com.example.androidlab.ui.theme.MyTextStyle.CommentNameStyle
import com.example.androidlab.ui.theme.MyTextStyle.CommentTextStyle

@Composable
fun Comment(image: Int, name: String, date: String, text: String) {
    Column(modifier = Modifier.padding(start = 24.dp)) {
        Row {
            Image(
                painter = painterResource(id = image),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(36.dp)
                    .width(36.dp)
                    .clip(RoundedCornerShape(25.dp))
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = name,
                    style = CommentNameStyle
                )
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    text = date,
                    style = CommentDateStyle
                )
            }
        }
        Text(
            text = text,
            style = CommentTextStyle,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}