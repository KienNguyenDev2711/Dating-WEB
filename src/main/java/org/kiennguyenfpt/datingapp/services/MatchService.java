package org.kiennguyenfpt.datingapp.services;

import org.kiennguyenfpt.datingapp.entities.Match;
import org.kiennguyenfpt.datingapp.entities.User;

import java.util.List;

public interface MatchService {
    Match createMatch(User user1, User user2);
    List<Match> getMatchesForUser(Long userId);
    boolean hasMatched(Long userId, Long targetUserId); // Thêm phương thức kiểm tra match
}
