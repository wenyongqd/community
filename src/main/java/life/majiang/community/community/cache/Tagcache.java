package life.majiang.community.community.cache;

import life.majiang.community.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tagcache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO program = new TagDTO();
        program.setCategoryName("Language");
        program.setTags(Arrays.asList("js","php","css","html","java","node","python","javascript","html5","node.js","c++","c","golang","objective-c","typescript","shell","swift","c#","sass","ruby","bash","less","asp.net","lua","scala","coffeescript","actionscript","rust","erlang","perl"));
        tagDTOS.add(program);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("Framework");
        framework.setTags(Arrays.asList("laravel","spring","express","django","flask","yii","ruby-on-rails","tornado","koa","struts"));

        TagDTO server = new TagDTO();
        server.setCategoryName("Server");
        server.setTags(Arrays.asList("linux","nginx","docker","apache","ubuntu","centos","unix","hadoop","windows-server"));
        tagDTOS.add(server);

        TagDTO db = new TagDTO();
        db.setCategoryName("Database");
        db.setTags(Arrays.asList("mysql","redis","mongodb","sql","oracle","nosql memcached","sqlserver","postgresql","sqllite"));
        tagDTOS.add(db);

        TagDTO tool = new TagDTO();
        tool.setCategoryName("Tool");
        tool.setTags(Arrays.asList("git","github","visual-studio-code","vim","sublime-text","xcode intellij-idea","eclipse","maven","ide","svn","visual-studio","atom emacs","textmate"));
        tagDTOS.add(tool);

        return tagDTOS;

    }

    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();

        List<String> tagList = tagDTOS.stream().flatMap(tag->tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }
}
