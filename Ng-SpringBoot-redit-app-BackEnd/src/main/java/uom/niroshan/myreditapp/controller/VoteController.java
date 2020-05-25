package uom.niroshan.myreditapp.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uom.niroshan.myreditapp.dto.VoteDto;
import uom.niroshan.myreditapp.service.VoteService;

@RestController
@RequestMapping("/api/votes/")
@AllArgsConstructor
public class VoteController {

    private final VoteService voteService;
    @PostMapping
    public ResponseEntity vote(@RequestBody VoteDto voteDto){
        voteService.vote(voteDto);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
