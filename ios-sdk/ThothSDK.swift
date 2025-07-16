
import Foundation

public protocol ThothListener {
    func onAction(action: String, data: String)
}

public class Thoth {
    public static var listener: ThothListener?

    public static func sendContext(_ context: String) {
        listener?.onAction(action: "process", data: "LLM response for: \(context)")
    }
}
