public struct PluginManagerView: View {
    public var plugins: [String]

    public var body: some View {
        VStack(alignment: .leading, spacing: 8) {
            Text("Plugin Manager").font(.largeTitle).padding(.bottom, 10)
            ForEach(plugins, id: \.self) { plugin in
                Text(plugin)
                    .padding()
                    .background(Color.blue.opacity(0.1))
                    .cornerRadius(10)
            }
        }
        .padding()
    }
}

