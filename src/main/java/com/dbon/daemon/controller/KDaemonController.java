package com.dbon.daemon.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kdaemon")
public class KDaemonController {

    @PostMapping("/dod")
    public String doIt(@RequestBody String input) {
        return "Daemon run "+input+"...";
    }
}