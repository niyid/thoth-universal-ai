
import axios from 'axios';

export async function callLLM(context, intent) {
  const res = await axios.post('https://api.openai.com/v1/chat/completions', {
    model: 'gpt-4o',
    messages: [{ role: 'user', content: `Intent: ${intent}\nContext: ${context}` }]
  }, {
    headers: { Authorization: `Bearer YOUR_API_KEY` }
  });
  return res.data.choices[0].message.content;
}
