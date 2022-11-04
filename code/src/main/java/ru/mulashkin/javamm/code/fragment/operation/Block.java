package ru.mulashkin.javamm.code.fragment.operation;

import java.util.List;
import java.util.stream.Collectors;

import ru.mulashkin.javamm.code.fragment.Operation;
import ru.mulashkin.javamm.code.fragment.SourceLine;

/**
 * @author FedorMulashkin
 * @link <a href="https://github.com/FedorMulashkin">My GitHub</a>
 */
public class Block extends AbstractOperation implements Operation {

    private final List<Operation> operations;

    public Block(final List<Operation> operations, final SourceLine sourceLine) {
        super(sourceLine);
        this.operations = List.copyOf(operations);
    }

    public Block(final Operation operation, final SourceLine sourceLine) {
        this(List.of(operation), sourceLine);
    }

    public List<Operation> getOperations() {
        return operations;
    }

    @Override
    public String toString() {
        return operations.stream()
            .map(Object::toString)
            .collect(Collectors.joining(System.lineSeparator()));
    }
}
