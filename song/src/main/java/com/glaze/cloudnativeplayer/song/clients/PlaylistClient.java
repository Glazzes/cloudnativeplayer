package com.glaze.cloudnativeplayer.song.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "playlist")
public interface PlaylistClient {



}
