package life.majiang.community.community.dto;

import life.majiang.community.community.model.User;
import lombok.Data;

@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreator;
    private Integer status;
    private String notifier;
    private String outerTitle;
    private String type;

}
