using Microsoft.AspNetCore.Mvc;

[ApiController]
[Route("lyrics")]
public class LyricsController
{
    public ContentResult GetLyrics()
    {
        var fileContents = File.ReadAllText("./Lyrics/mylyrics.html");
        return new ContentResult
        {
            Content = fileContents,
            ContentType = "text/html"
        };

    }
}