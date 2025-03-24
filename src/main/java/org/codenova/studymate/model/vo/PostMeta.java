package org.codenova.studymate.model.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.codenova.studymate.model.entity.Reaction;

import java.util.List;

@Setter
@Getter
@Builder
public class PostMeta {
    private int id;
    private String content;
    private String writerName;
    private String writerAvatar;
    private String time;

    private List<Reaction> reactions;
}
