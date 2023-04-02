using System;
using System.Net.Http;
using System.Threading.Tasks;

namespace asp.net.mvc.Models
{
    public class MusicModel
    {
        public string Faith { get; set; }
        public string Queen { get; set;} 
        public MusicModel()
        {
            Faith = GetFaithAsync().Result;
        }

        public HttpClient CreateFaithClient()
        {
            var client = new HttpClient();
            client.BaseAddress = new Uri("https://localhost:5001/Music/Faith");
            return client;
        }

        public HttpClient CreateQueenClient()
        {
            var client = new HttpClient();
            client.BaseAddress = new Uri("https://localhost:5001/Music/Queen");
            return client;
        }

        public async Task<String> GetFaithAsync()
        {
            using (var client = CreateFaithClient())
            {
                HttpResponseMessage response;
                response = client.GetAsync(client.BaseAddress).Result;

                if (response.IsSuccessStatusCode)
                {
                    var faithlyrics = await response.Content.ReadAsStringAsync();
                    return faithlyrics;
                }
                else
                {
                    return "??";
                }
            }
        }
    }
}
