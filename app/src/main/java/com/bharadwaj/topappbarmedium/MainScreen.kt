package com.bharadwaj.topappbarmedium

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    /**
     * scrollBehavior is used to get the instance of different
     * scroll behaviors
     */
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        /**
         * we are participating our scaffold in the nestedScroll by using the
         * instance of our scroll behavior
         */
        modifier = Modifier.fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        containerColor = MaterialTheme.colorScheme.background,

        /**
         * our top app bar
         */
        topBar = {
            LargeTopAppBar(
                title = {
                    Text("Hey there!")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            /** handle back press */
                        }
                    ){
                        Icon(
                            Icons.Rounded.ArrowBack,
                            contentDescription = "back_icon"
                        )
                    }
                },
                /**
                 * giving the instance of our scroll behavior to our
                 * top app bar
                 */
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    scrolledContainerColor = MaterialTheme.colorScheme.primary
                ),
            )
        },
    ) { paddingValues ->
        /**
         * content of scaffold
         */
        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            item {
                Spacer(Modifier.height(20.dp))
                Image(
                    painterResource(R.drawable.login),
                    contentDescription = "content_image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.clip(MaterialTheme.shapes.medium)
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    "Well don't copy paste this code! try to do it by yourself.",
                    Modifier.padding(horizontal = 20.dp),
                    textAlign = TextAlign.Center
                )
            }
            item {
                Spacer(Modifier.height(20.dp))
                Image(
                    painterResource(R.drawable.login),
                    contentDescription = "content_image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.clip(MaterialTheme.shapes.medium)
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    "Well don't copy paste this code! try to do it by yourself.",
                    Modifier.padding(horizontal = 20.dp),
                    textAlign = TextAlign.Center
                )
            }
            item {
                Spacer(Modifier.height(20.dp))
                Image(
                    painterResource(R.drawable.login),
                    contentDescription = "content_image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.clip(MaterialTheme.shapes.medium)
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    "Well don't copy paste this code! try to do it by yourself.",
                    Modifier.padding(horizontal = 20.dp),
                    textAlign = TextAlign.Center
                )
            }
            item {
                Spacer(Modifier.height(20.dp))
                Image(
                    painterResource(R.drawable.login),
                    contentDescription = "content_image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.clip(MaterialTheme.shapes.medium)
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    "Well don't copy paste this code! try to do it by yourself.",
                    Modifier.padding(horizontal = 20.dp),
                    textAlign = TextAlign.Center
                )
            }
            item {
                Spacer(Modifier.height(20.dp))
                Image(
                    painterResource(R.drawable.login),
                    contentDescription = "content_image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.clip(MaterialTheme.shapes.medium)
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    "Well don't copy paste this code! try to do it by yourself.",
                    Modifier.padding(horizontal = 20.dp),
                    textAlign = TextAlign.Center
                )
            }
            item {
                Spacer(Modifier.height(20.dp))
                Image(
                    painterResource(R.drawable.login),
                    contentDescription = "content_image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.clip(MaterialTheme.shapes.medium)
                )
                Spacer(Modifier.height(10.dp))
                Text(
                    "Well don't copy paste this code! try to do it by yourself.",
                    Modifier.padding(horizontal = 20.dp),
                    textAlign = TextAlign.Center
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    MainScreen()
}