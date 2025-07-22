import axios from 'axios';

export const ThothLLM = {
    queryOpenAI: async (prompt: string): Promise<string> => {
        const apiKey = 'sk-xxxx'; // Replace with your key or pass it in securely
        const res = await axios.post('https://api.openai.com/v1/chat/completions', {
            model: 'gpt-3.5-turbo',
            messages: [{ role: 'user', content: prompt }]
        }, {
            headers: {
                Authorization: `Bearer ${apiKey}`,
                'Content-Type': 'application/json'
            }
        });
        return res.data.choices[0].message.content;
    },

    queryOllama: async (prompt: string): Promise<string> => {
        const res = await axios.post('http://localhost:11434/api/generate', {
            model: 'llama2',
            prompt: prompt
        });
        return res.data.response;
    }
};

