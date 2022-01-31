package format.format.service;

import org.springframework.stereotype.Service;

@Service
public class ForChangeServiceImpl implements ForChangeService {
    @Override
    public String change(String s) {
        String[] strings = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s1 : strings) {
            stringBuilder.append(s1.charAt(0));
            stringBuilder.append(s1.substring(1).toLowerCase());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
