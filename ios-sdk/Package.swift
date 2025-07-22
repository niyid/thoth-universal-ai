// swift-tools-version:5.7
import PackageDescription

let package = Package(
    name: "Thoth",
    platforms: [.iOS(.v14)],
    products: [.library(name: "Thoth", targets: ["Thoth"])],
    targets: [.target(name: "Thoth", dependencies: [])]
)
