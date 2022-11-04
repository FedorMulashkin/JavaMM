package ru.mulashkin.javamm.code.fragment.operation;

import static java.util.Objects.requireNonNull;
import ru.mulashkin.javamm.code.fragment.Operation;
import ru.mulashkin.javamm.code.fragment.SourceLine;

/**
 * @author FedorMulashkin
 * @link <a href="https://github.com/FedorMulashkin">My GitHub</a>
 */
public class PrintlnOperation extends AbstractOperation implements Operation {
    private final String text;

    public PrintlnOperation(final SourceLine sourceLine, final String text) {
        super(sourceLine);
        this.text = requireNonNull(text);
    }

    public String getText() {
        return text;
    }
}
