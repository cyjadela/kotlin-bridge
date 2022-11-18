package bridge

fun main() {
    println("다리 건너기 게임을 시작합니다.\n")

    val inputView = InputView()
    var bridgeLength = inputView.readBridgeSize()

    val bridgeMaker = BridgeMaker(BridgeRandomNumberGenerator())
    val answerBridge = bridgeMaker.makeBridge(bridgeLength)

    BridgeGame().move(answerBridge)

}
