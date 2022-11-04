package ru.mulashkin.javamm.code.fragment.operation;

import static java.util.Objects.requireNonNull;
import ru.mulashkin.javamm.code.fragment.Operation;
import ru.mulashkin.javamm.code.fragment.SourceLine;

/**
 * @author FedorMulashkin
 * @link <a href="https://github.com/FedorMulashkin">My GitHub</a>
 */
public abstract class AbstractOperation implements Operation {
    private final SourceLine sourceLine;

    public AbstractOperation(final SourceLine sourceLine) {
        this.sourceLine = requireNonNull(sourceLine);
    }

    @Override
    public final SourceLine getSourceLine() {
        return sourceLine;
    }

    @Override
    public String toString() {
        return sourceLine.toString();
    }
}
