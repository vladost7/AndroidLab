import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidlab.R
import com.example.androidlab.ui.theme.MyTextStyle.HeaderCounterStyle
import com.example.androidlab.ui.theme.MyTextStyle.HeaderTextStyle
import com.example.androidlab.ui.theme.colorBackground
import com.example.androidlab.ui.theme.colorDarkGray
@Preview(showBackground = true)
@Composable
fun DotaScreenHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.back),
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(310.dp)
        )
        Box(
            modifier = Modifier
                .padding(top = 290.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp))
                .background(Color(android.graphics.Color.parseColor(colorBackground)))
        ) {
            Column(
                modifier = Modifier.padding(start = 124.dp, bottom = 10.dp, top = 14.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.logo_text),
                    style = HeaderTextStyle
                )
                Row(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.stars5),
                        contentDescription = "image",
                        modifier = Modifier
                            .align(Alignment.Bottom)
                            .height(12.dp)
                            .width(76.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.count_reviewers),
                        modifier = Modifier
                            .align(Alignment.Bottom)
                            .padding(start = 10.dp),
                        style = HeaderCounterStyle
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(top = 270.dp, start = 24.dp)
                .border(
                    width = 1.dp,
                    color = Color(android.graphics.Color.parseColor(colorDarkGray)),
                    shape = RoundedCornerShape(20.dp)
                )
                .background(
                    color = Color.Black,
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(17.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.dotaico),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(54.dp)
                    .width(54.dp)
            )
        }
    }
}