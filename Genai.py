from google import genai

client = genai.Client(api_key="")

while True:
    prompt = input("You: ")

    if prompt.lower() in ["exit", "quit"]: 
        break

    interaction = client.models.generate_content(
        model="gemini-2.5-flash", 
        contents=prompt
    )

    print("Gemini:", interaction.text)